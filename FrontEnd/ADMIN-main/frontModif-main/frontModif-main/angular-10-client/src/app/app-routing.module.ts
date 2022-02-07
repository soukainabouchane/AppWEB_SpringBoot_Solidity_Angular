import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RegisterComponent } from './register/register.component';
import { LoginComponent } from './login/login.component';

import { ProfileComponent } from './profile/profile.component';
import { BoardUserComponent } from './board-user/board-user.component';

import { BoardAdminComponent } from './AjouterContract/board-admin.component';


import { DetailComponent } from './detail/detail/detail.component';

import { HomeComponent } from './home/home.component';
import { ListContartUserComponent } from './list-contart-user/list-contart-user.component';
import { ListContartAdminComponent } from './list-contart-admin/list-contart-admin.component';
import { ConsulterContratComponent } from './consulter-contrat/consulter-contrat.component';
const routes: Routes = [
  {path:'',component:HomeComponent},
  { path: 'login', component: LoginComponent },
  { path: 'register', component: RegisterComponent },
  { path: 'profile', component: ProfileComponent },
  { path: 'user', component: BoardUserComponent },
  { path: 'admin', component: BoardAdminComponent },
  { path: 'listContratAdmin', component:ListContartAdminComponent},
  { path: 'consulterContrat', component:ConsulterContratComponent},
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
