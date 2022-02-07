import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { FormsModule } from '@angular/forms';


import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';

import { ProfileComponent } from './profile/profile.component';
import { BoardAdminComponent } from './AjouterContract/board-admin.component';

import { BoardUserComponent } from './board-user/board-user.component';

import { authInterceptorProviders } from './_helpers/auth.interceptor';


import { HttpClientModule } from '@angular/common/http';
import { DetailComponent } from './detail/detail/detail.component';

import { ChildComponentComponent } from './childComponent/child-component/child-component.component';
import { HomeComponent } from './home/home.component';
import { ConsulterContratComponent } from './consulter-contrat/consulter-contrat.component';
import { ListContartAdminComponent } from './list-contart-admin/list-contart-admin.component';
import { ListContartUserComponent } from './list-contart-user/list-contart-user.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { AproposComponent } from './apropos/apropos.component';
import { ContactComponent } from './contact/contact.component';
import { EspaceclientComponent } from './espaceclient/espaceclient.component';
import { UpdateUserComponent } from './update-user/update-user.component';
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    RegisterComponent,
  
    ProfileComponent,
    BoardAdminComponent,
 
    BoardUserComponent,
   
    DetailComponent,
  
    ChildComponentComponent,
    HomeComponent,
    ConsulterContratComponent,
    ListContartAdminComponent,
    ListContartUserComponent,
    AproposComponent,
    ContactComponent,
    EspaceclientComponent,
    UpdateUserComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    BrowserAnimationsModule
  ],
  providers: [authInterceptorProviders],
  bootstrap: [AppComponent]
})
export class AppModule { }
