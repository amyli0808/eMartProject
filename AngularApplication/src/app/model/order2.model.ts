import { Injectable } from "@angular/core";


@Injectable()
export class Order2 {

    public id: number;
    public name: string;
    public address: string;
    public city: string;
    public state: string;
    public zip: string;
    public country: string;
    public shipped: boolean = false;


    
}
