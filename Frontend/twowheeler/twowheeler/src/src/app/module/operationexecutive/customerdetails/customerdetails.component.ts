import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Companyenquirydetails } from 'app/model/companyenquirydetails';
import { CommonService } from 'app/shared/common.service';

@Component({
  selector: 'app-customerdetails',
  templateUrl: './customerdetails.component.html',
  styleUrls: ['./customerdetails.component.css']
})
export class CustomerdetailsComponent implements OnInit {
ced:Companyenquirydetails
  constructor(private ro:ActivatedRoute,private cs:CommonService) { }

  ngOnInit(): void {

    this.ro.paramMap.subscribe(param1=>{
      this.cs.getsinglecustomer(parseInt(param1.get('enqId'))).subscribe(data=>{
        this.ced=data;
  })
})
  }
}
