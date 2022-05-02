FROM node:12.4.0-alpine as build
WORKDIR /frontend
ENV PATH /frontend/node_modules/.bin:$PATH
COPY package.json .
COPY package-lock.json .
RUN npm install --silent
COPY . ./
# Arguments
ARG REACT_APP_API_BASE_URL
ENV REACT_APP_API_BASE_URL=${REACT_APP_API_BASE_URL}

RUN npm run build

FROM nginx:stable-alpine
COPY --from=build /frontend /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]