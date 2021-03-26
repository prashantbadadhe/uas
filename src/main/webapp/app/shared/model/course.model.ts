import { IStudent } from 'app/shared/model/student.model';

export interface ICourse {
  id?: number;
  courseCode?: string;
  courseName?: string;
  studentIds?: IStudent[];
}

export class Course implements ICourse {
  constructor(public id?: number, public courseCode?: string, public courseName?: string, public studentIds?: IStudent[]) {}
}
