import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';
import {HttpModule} from '@angular/http';
import {RouterModule, Routes} from '@angular/router';
import {BrowserModule, By} from '@angular/platform-browser';

import {AppComponent}  from './app.component';
import {MovieListComponent} from './movie-list/movie-list.component';
import {MovieDetailComponent} from './movie-detail/movie-detail.component';
import {NotFoundComponent} from './not-found/not-found.component';
import {ByImdbRateComponent} from './by-imdb-rate/by-imdb-rate.component';
import {AdminHomeComponent} from './admin-home/admin-home.component';
import {AdminAddMovieComponent} from './admin-add-movie/admin-add-movie.component';
import {AdminDeleteMovieComponent} from './admin-delete-movie/admin-delete-movie.component';
import {LoginFormComponent} from './login/login-form.component';
import {RegisterComponent} from './register/register.component';
import {TopMovieComponent} from './top-movie/top-movie.component';



import {UserService} from './user-service/user.service';

const appRoutes: Routes = [
    {path: 'users', component: MovieListComponent},
    {path: 'users/:id', component: MovieDetailComponent},
    {path: 'login', component: LoginFormComponent},
    {path: 'register', component: RegisterComponent},
    {path: 'top-movie', component: TopMovieComponent},


    {path: '', redirectTo: 'login', pathMatch: 'full'},
    {path: 'by-imdb-rate', component: ByImdbRateComponent},

    {path: 'admin-home', component: AdminHomeComponent},
    {path: 'admin-add-movie', component: AdminAddMovieComponent},
    {path: 'admin-delete-movie', component: AdminDeleteMovieComponent},


    {path: '**', component: NotFoundComponent}
];

@NgModule({
    imports: [BrowserModule, HttpModule, RouterModule.forRoot(appRoutes), FormsModule],
    declarations: [AppComponent, MovieListComponent, MovieDetailComponent,
        NotFoundComponent, ByImdbRateComponent, AdminHomeComponent,
        AdminAddMovieComponent, AdminDeleteMovieComponent, LoginFormComponent,
        RegisterComponent,TopMovieComponent
    ],
    providers: [UserService],
    bootstrap: [AppComponent]
})
export class AppModule {

}

console.log('Running');
