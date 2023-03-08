import { ComponentFixture, TestBed } from '@angular/core/testing';

import { StudentPrefComponent } from './student-pref.component';

describe('StudentPrefComponent', () => {
  let component: StudentPrefComponent;
  let fixture: ComponentFixture<StudentPrefComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ StudentPrefComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(StudentPrefComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
