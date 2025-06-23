import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SurveyComponent } from './survey/survey.component';
import { SurveysuccessComponent } from './surveysuccess/surveysuccess.component';

const routes: Routes = [
  {path:'',redirectTo:'survey' ,pathMatch:'full',runGuardsAndResolvers:'always'},
  {path:'surveysuccess',component:SurveysuccessComponent},
  {path:'survey',component:SurveyComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
