import {Component} from '@angular/core';
import {UserService} from '../user-service/user.service';

@Component({
    templateUrl: 'movie-list.component.html'
})
export class MovieListComponent {

    movieList: any = [];

    constructor(private userService: UserService) {

        userService.getUsers()
            .subscribe(
                movie => this.movieList = movie,
                error => console.log(error)
            );
    }
}