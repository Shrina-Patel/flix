import {Component} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {UserService} from '../user-service/user.service';

@Component({
    templateUrl: 'register.component.html'
})
export class RegisterComponent {

    user = {};

    addUser() {
        console.log(this.user);
    }

}