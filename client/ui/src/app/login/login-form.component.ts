import {Component} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {UserService} from '../user-service/user.service';

@Component({
    templateUrl: 'login-form.component.html'
})
export class LoginFormComponent {

    user = {};

    addUser() {
        console.log(this.user);
    }

}