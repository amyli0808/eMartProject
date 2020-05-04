import { Component, OnInit } from '@angular/core';
import { Router }  from '@angular/router';
import { NgForm } from "@angular/forms";


@Component({
  selector: 'signin',
  templateUrl: './signin.component.html',
  styleUrls: ['./signin.component.css']
})
export class SigninComponent implements OnInit {
  
  
  
  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  toStore(){
    this.router.navigateByUrl("/store");
  }

  

}
