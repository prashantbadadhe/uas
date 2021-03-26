import { Moment } from 'moment';
import { ICourse } from 'app/shared/model/course.model';

export interface IStudent {
  id?: number;
  studentId?: string;
  firstName?: string;
  middleName?: string;
  lastName?: string;
  gender?: string;
  email?: string;
  phoneNumber?: string;
  dateOfBirth?: Moment;
  age?: number;
  courses?: ICourse[];
}

export class Student implements IStudent {
  constructor(
    public id?: number,
    public studentId?: string,
    public firstName?: string,
    public middleName?: string,
    public lastName?: string,
    public gender?: string,
    public email?: string,
    public phoneNumber?: string,
    public dateOfBirth?: Moment,
    public age?: number,
    public courses?: ICourse[]
  ) {}
}
