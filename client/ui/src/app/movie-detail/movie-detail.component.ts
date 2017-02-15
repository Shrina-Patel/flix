import {Component} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {UserService} from '../user-service/user.service';

@Component({
    templateUrl: 'movie-detail.component.html'
})
export class MovieDetailComponent {

    movie: any = {};

    constructor(private route: ActivatedRoute, private userService: UserService) {
        this.route.params.subscribe(
            params => {
                userService.getUserById(params['id'])
                    .subscribe(
                        movie => this.movie = movie,
                        error => console.log(error)
                    );
            });
    }
}