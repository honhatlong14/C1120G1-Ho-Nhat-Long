import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-font-size-editor',
  templateUrl: './font-size-editor.component.html',
  styleUrls: ['./font-size-editor.component.css']
})
export class FontSizeEditorComponent implements OnInit {
  frontSize = 14;
  fontSize = 14;
  constructor() { }

  ngOnInit(): void {
  }

  changeFrontSizeValue(frontSize){
    this.frontSize = frontSize;
    console.log(frontSize)
  }
  changeFontSizeValue(fontSize){
    this.fontSize = fontSize
  }
}
