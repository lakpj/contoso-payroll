FROM node:12.4.0-alpine as build
WORKDIR /frontend
ENV PATH /frontend/node_modules/.bin:$PATH
COPY src src
COPY package.json .
COPY package-lock.json .
COPY webpack.config.js .
RUN npm install --silent
COPY . /frontend
RUN npm run

# production environment
FROM nginx:1.16.0-alpine
COPY --from=build /frontend/node_modules /usr/share/nginx/html
RUN rm /etc/nginx/conf.d/default.conf
COPY ./nginx/nginx.conf /etc/nginx/conf.d
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]