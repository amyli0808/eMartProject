import { NgModule } from "@angular/core";
import { BrowserModule } from "@angular/platform-browser";
import { AppComponent } from "./app.component";
import { StoreModule } from "./store/store.module";
import { StoreComponent } from "./store/store.component";
import { CheckoutComponent } from "./store/checkout.component";
import { CartDetailComponent } from "./store/cartDetail.component";
import { RouterModule } from "@angular/router";
import { StoreFirstGuard } from "./storeFirst.guard";
import { HomeComponent } from "./home/home.component";
import { SigninComponent} from "./home/signin/signin.Component";
import { BuyersignupComponent } from "./home/buyersignup/buyersignup.component";
import { SellersignupComponent } from "./home/sellersignup/sellersignup.component";
//import { AdminComponent } from "./admin/admin.component";
import { HistoryComponent } from "./store/history.component";
import { AdditemComponent } from "./store/additem.component";
import { MoneyPipe } from './money.pipe';

@NgModule({
    imports: [BrowserModule, StoreModule,
        RouterModule.forRoot([
            {
                path: "home", component: HomeComponent               
             },
             {
                path: "signin", component: SigninComponent               
             },
             {
                path: "buyersignup", component: BuyersignupComponent               
             },
             {
                path: "sellersignup", component: SellersignupComponent               
             },
            {
                path: "store", component: StoreComponent,
                canActivate: [StoreFirstGuard]
            },
            {
                path: "cart", component: CartDetailComponent,
                canActivate: [StoreFirstGuard]
            },
            {
                path: "history", component: HistoryComponent,
                canActivate: [StoreFirstGuard]
            },
            {
                path: "additem", component: AdditemComponent,
                canActivate: [StoreFirstGuard]
            },
            {
                path: "checkout", component: CheckoutComponent,
                canActivate: [StoreFirstGuard]
            },
            {
            //    path: "sellersystem" ,  component:AdminComponent,
                path: "admin",
                loadChildren: "./admin/admin.module#AdminModule",
                canActivate: [StoreFirstGuard]
            },

           { path: "**", redirectTo: "/home" }

        ])],
    providers: [StoreFirstGuard],
    declarations: [AppComponent, MoneyPipe],
    bootstrap: [AppComponent]
})
export class AppModule { }
