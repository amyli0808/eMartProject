import { Component } from '@angular/core';
import { NgForm } from "@angular/forms";
import { OrderRepository } from "../model/order.repository";
import { Order } from "../model/order.model";
import { Order2 } from "../model/order2.model";

@Component({
  selector: 'app-additem',
  templateUrl: './additem.component.html',
  styleUrls: ['./additem.component.css']
})
export class AdditemComponent  {
  orderSent: boolean = false;
  submitted: boolean = false;

  constructor(public repository: OrderRepository,
              public order2: Order2) {}

  submitOrder(form: NgForm) {
      this.submitted = true;
      if (form.valid) {
          this.repository.saveOrder2(this.order2).subscribe(order2 => {
             // this.order.clear();
              this.orderSent = true;
              this.submitted = false;
          });
      }
  }

}
