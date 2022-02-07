import { TestBed } from '@angular/core/testing';

import { BddServiceService } from './bdd-service.service';

describe('BddServiceService', () => {
  let service: BddServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(BddServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
