import { TestBed } from '@angular/core/testing';

import { EtherumServiceService } from './etherum-service.service';

describe('EtherumServiceService', () => {
  let service: EtherumServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EtherumServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
