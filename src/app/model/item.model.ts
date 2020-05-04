import { Injectable } from "@angular/core";
import { Cart } from "./cart.model";

@Injectable()
export class Item {
    public id: number;
    public category: string;
    public subcategory: string;
    public itemname: string;
    public price?: number;
    public itemtype: string;
    public country: string;
    public shipped: boolean = false;

    constructor(public cart: Cart) { }

    clear() {
        this.id = null;
        this.category = this.subcategory = this.itemname = null;
        this.price = this.itemtype = this.country = null;
        this.shipped = false;
        this.cart.clear();
    }
}
