import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import './vendor';
import { UasSharedModule } from 'app/shared/shared.module';
import { UasCoreModule } from 'app/core/core.module';
import { UasAppRoutingModule } from './app-routing.module';
import { UasHomeModule } from './home/home.module';
import { UasEntityModule } from './entities/entity.module';
// jhipster-needle-angular-add-module-import JHipster will add new module here
import { MainComponent } from './layouts/main/main.component';
import { NavbarComponent } from './layouts/navbar/navbar.component';
import { FooterComponent } from './layouts/footer/footer.component';
import { PageRibbonComponent } from './layouts/profiles/page-ribbon.component';
import { ErrorComponent } from './layouts/error/error.component';

@NgModule({
  imports: [
    BrowserModule,
    UasSharedModule,
    UasCoreModule,
    UasHomeModule,
    // jhipster-needle-angular-add-module JHipster will add new module here
    UasEntityModule,
    UasAppRoutingModule,
  ],
  declarations: [MainComponent, NavbarComponent, ErrorComponent, PageRibbonComponent, FooterComponent],
  bootstrap: [MainComponent],
})
export class UasAppModule {}
