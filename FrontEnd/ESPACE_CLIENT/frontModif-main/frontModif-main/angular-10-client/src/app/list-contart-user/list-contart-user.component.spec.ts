import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListContartUserComponent } from './list-contart-user.component';

describe('ListContartUserComponent', () => {
  let component: ListContartUserComponent;
  let fixture: ComponentFixture<ListContartUserComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListContartUserComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListContartUserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
