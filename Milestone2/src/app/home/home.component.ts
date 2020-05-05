import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";

@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']

})


export class HomeComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }
  
  signIn(){
    this.router.navigateByUrl("/signin");
  }

  buyerSignUp(){
    this.router.navigateByUrl("/buyersignup");
  }

  sellerSignUp(){
    this.router.navigateByUrl("/sellersignup");
  }

}
