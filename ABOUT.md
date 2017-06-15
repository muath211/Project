#e-booking

This is a very simple Spring boot application mainly consumes a REST-ful Service and displays the results in a simple pages. also
there are a very simple search page that could help in filtering the results.

The app consists of two layers, the UI layer which is built with spring-mvc with jsp as templating enginea also bootstrap for styling, and the services
layer that acts as provider uses spring rest templates to consume REST-ful services.

Most of things are close to generic so that any time it can be modified or customized.

Reasons for choosing spring boot to built the app: simple answer, getting the app ready and running with spring boot is much faster than
the normal approach. also there are alot of advantages for using spring boot big one of them is microservices made easy. for more info
follow the link https://projects.spring.io/spring-boot/.

issues:
- I tried to limit there results to do some sort of paging but unfortunately I couldn't fine the specific paramters          to do that if there are even exists at first place.
  - the minimal info are shown on the UI there are many other properties that can be easly shown if wanted.
