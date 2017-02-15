import {Component} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {UserService} from '../user-service/user.service';

@Component({
    templateUrl: 'admin-home.component.html'
})
export class AdminHomeComponent {

    movieList: any = [];

    constructor(private userService: UserService) {

        userService.getUsers()
            .subscribe(
                movie => this.movieList = movie,
                error => console.log(error)
            );
    }
}