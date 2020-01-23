export interface ICustomer {
  id?: number;
  code?: string;
  fname?: string;
  lname?: string;
}

export class Customer implements ICustomer {
  constructor(public id?: number, public code?: string, public fname?: string, public lname?: string) {}
}
