import {Component} from '@angular/core';
import {UserService} from '../user-service/user.service';

@Component({
    templateUrl: 'by-imdb-rate.component.html'
})
export class ByImdbRateComponent {

    movieList: any = [];

    constructor(private userService: UserService) {

        userService.getUsers()
            .subscribe(
                users => this.movieList = users,
                error => console.log(error)
            );
    }
}
