import { NgModule } from '@angular/core';
import { BrowserModule } from "@angular/platform-browser";
import { CommonModule } from '@angular/common';
import { RouterModule } from "@angular/router";
import { HomeComponent }   from "./home.component";
import { ModelModule } from "../model/model.module";
import { SigninComponent } from './signin/signin.component';
import { BuyersignupComponent } from './buyersignup/buyersignup.component';
import { SellersignupComponent } from './sellersignup/sellersignup.component';



@NgModule({
  declarations: [HomeComponent, SigninComponent, BuyersignupComponent, SellersignupComponent],
  imports: [ModelModule, BrowserModule,CommonModule,RouterModule ],
  exports: [ HomeComponent, SigninComponent ]
})
export class HomeModule { }
