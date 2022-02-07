import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';

import { ProfileComponent } from './profile/profile.component';
import { BoardUserComponent } from './board-user/board-user.component';

import { BoardAdminComponent } from './AjouterContract/board-admin.component';

import { AproposComponent } from './apropos/apropos.component';

import { ContactComponent } from './contact/contact.component';

import { DetailComponent } from './detail/detail/detail.component';

import { HomeComponent } from './home/home.component';
import { ListContartUserComponent } from './list-contart-user/list-contart-user.component';
import { ListContartAdminComponent } from './list-contart-admin/list-contart-admin.component';
import { ConsulterContratComponent } from './consulter-contrat/consulter-contrat.component';
import { EspaceclientComponent } from './espaceclient/espaceclient.component';
import { UpdateUserComponent } from './update-user/update-user.component';
const routes: Routes = [
  {path:'',component:HomeComponent},
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'user', component: BoardUserComponent },
  { path: 'admin', component: BoardAdminComponent },
  { path: 'apropos', component: AproposComponent },
  { path: 'contact', component: ContactComponent },
  { path: 'espaceclient', component: EspaceclientComponent },
  { path: 'listContratAdmin', component:ListContartAdminComponent},
  { path: 'consulterContrat', component:ConsulterContratComponent},
  { path: 'updateuser/:id', component:UpdateUserComponent},
  { path: 'listContratUser', component:  ListContartUserComponent },
  { path: '', redirectTo: 'home', pathMatch: 'full' },

  {
    path:'detail/:titre',
    component: DetailComponent,
  }
 
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
