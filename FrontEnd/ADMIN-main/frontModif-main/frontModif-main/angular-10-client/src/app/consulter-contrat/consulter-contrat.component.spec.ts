import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ConsulterContratComponent } from './consulter-contrat.component';

describe('ConsulterContratComponent', () => {
  let component: ConsulterContratComponent;
  let fixture: ComponentFixture<ConsulterContratComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ConsulterContratComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ConsulterContratComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
