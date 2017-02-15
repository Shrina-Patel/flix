import {Component} from '@angular/core';
import {UserService} from '../user-service/user.service';

@Component({
    templateUrl: 'top-movie.component.html'
})
export class TopMovieComponent {

    movieList: any = [];

    constructor(private userService: UserService) {

        userService.getUsers()
            .subscribe(
                users => this.movieList = users,
                error => console.log(error)
            );
    }
}
