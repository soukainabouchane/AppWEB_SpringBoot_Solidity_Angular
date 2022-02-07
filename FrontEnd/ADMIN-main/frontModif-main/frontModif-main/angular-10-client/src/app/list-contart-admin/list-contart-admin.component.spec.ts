import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListContartAdminComponent } from './list-contart-admin.component';

describe('ListContartAdminComponent', () => {
  let component: ListContartAdminComponent;
  let fixture: ComponentFixture<ListContartAdminComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListContartAdminComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListContartAdminComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
