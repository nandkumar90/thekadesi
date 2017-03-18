
function shoppingCart(cartName) {
    this.cartName = cartName;
    this.clearCart = false;
    this.checkoutParameters = {};
    this.items = [];

    
    this.loadItems();

    
    var self = this;
    $(window).unload(function () {
        if (self.clearCart) {
            self.clearItems();
        }
        self.saveItems();
        self.clearCart = false;
    });
}


shoppingCart.prototype.loadItems = function () {
    var items = localStorage != null ? localStorage[this.cartName + "_items"] : null;
    if (items != null && JSON != null) {
        try {
            var items = JSON.parse(items);
            for (var i = 0; i < items.length; i++) {
                var item = items[i];
                if (item.sku != null && item.name != null && item.price != null && item.quantity != null && item.type !=null) {
                    item = new cartItem(item.sku, item.name, item.price, item.quantity,item.type);
                    this.items.push(item);
                }
            }
        }
        catch (err) {
            
        }
    }
}

shoppingCart.prototype.isInCart=function(id){
    for(var i=0;i<this.items.length;i++){
        if(this.items[i].sku===id)
            return true;
    }
 return false;
}



shoppingCart.prototype.saveItems = function () {
    if (localStorage != null && JSON != null) {
        localStorage[this.cartName + "_items"] = JSON.stringify(this.items);
    }
}


shoppingCart.prototype.addItem = function (sku, name, price, quantity,type) {
    console.log(sku,name,price,quantity,type);
    quantity = this.toNumber(quantity);
    if (quantity != 0) {

        // update quantity for existing item
        var found = false;
        for (var i = 0; i < this.items.length && !found; i++) {
            var item = this.items[i];
            if (item.sku == sku) {
                found = true;
                item.quantity = this.toNumber(item.quantity + quantity);
                if (item.quantity <= 0) {
                    this.items.splice(i, 1);
                }
            }
        }

       
        if (!found) {
            var item = new cartItem(sku, name, price, quantity,type);
            this.items.push(item);
        }

        
        this.saveItems();
        console.log(this.items.length);
        return this.items.length;
    }
}


shoppingCart.prototype.getTotalPrice = function (sku) {
    var total = 0;
    for (var i = 0; i < this.items.length; i++) {
        var item = this.items[i];
        if (sku == null || item.sku == sku) {
            total += this.toNumber(item.quantity * item.price);
        }
    }
    return total;
}


shoppingCart.prototype.getTotalCount = function (sku) {
    var count = 0;
    for (var i = 0; i < this.items.length; i++) {
        var item = this.items[i];
        if (sku == null || item.sku == sku) {
            count += this.toNumber(item.quantity);
        }
    }
    return count;
}


shoppingCart.prototype.clearItems = function () {
    this.items = [];
    this.saveItems();
}






shoppingCart.prototype.toNumber = function (value) {
    value = value * 1;
    return isNaN(value) ? 0 : value;
}




function cartItem(sku, name, price, quantity,type) {
    this.sku = sku;
    this.name = name;
    this.price = price * 1;
    this.quantity = quantity * 1;
    this.type=type
}

