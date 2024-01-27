import { Location } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Companyenquirydetails } from 'app/model/companyenquirydetails';
import { CommonService } from 'app/shared/common.service';

@Component({
  selector: 'app-viewcusstomer',
  templateUrl: './viewcusstomer.component.html',
  styleUrls: ['./viewcusstomer.component.css']
})
export class ViewcusstomerComponent implements OnInit {
  item:Companyenquirydetails;
  constructor(private routes:ActivatedRoute,private cs:CommonService,private location:Location) { }

  ngOnInit(): void {
    this.routes.paramMap.subscribe(param1=>{
    this.cs.getsinglecustomer(parseInt(param1.get('enqId'))).subscribe(data=>{
      this.item=data;
      console.log("hello");
      console.log(data);
    })
  })
  }
  getback(){

  }

}
