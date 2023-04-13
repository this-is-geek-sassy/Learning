import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'usdToInr'
})
export class UsdToInrPipe implements PipeTransform {

  transform(value: number, ...args: number[]): number {

    const [x, y] = args;
    return (value*x)+1;
  }

}
