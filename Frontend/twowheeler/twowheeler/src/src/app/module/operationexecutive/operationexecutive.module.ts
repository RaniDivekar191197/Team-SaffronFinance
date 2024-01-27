import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { DashboardComponent } from './dashboard/dashboard.component';
import { RouterModule, Routes } from '@angular/router';
import { ViewequiryComponent } from './viewequiry/viewequiry.component';
import { CibilscoreComponent } from './cibilscore/cibilscore.component';

import { ReactiveFormsModule } from '@angular/forms';
import { DocumentuploadComponent } from './documentupload/documentupload.component';
import { ViewcusstomerComponent } from './viewcusstomer/viewcusstomer.component';
import { CustomerdetailsComponent } from './customerdetails/customerdetails.component';
import { CustomerdetailviewComponent } from './customerdetailview/customerdetailview.component';


const oerouting: Routes = [
  {path: 'oedash', component: DashboardComponent},
  {path:'oeenq',component:ViewequiryComponent},
  
  {path:'cibil',component:CibilscoreComponent},
  {path:'uploaddoc' ,component:DocumentuploadComponent},
  {path:'custdetails' ,component:CustomerdetailsComponent},
  {path:'oecustomer',component:ViewcusstomerComponent},
  
];
@NgModule({
  declarations: [DashboardComponent, ViewequiryComponent,DocumentuploadComponent,CibilscoreComponent, CustomerdetailsComponent, CustomerdetailviewComponent,],
  imports: [
    CommonModule,ReactiveFormsModule,RouterModule.forChild(oerouting)
  ]
})
export class OperationexecutiveModule { }
