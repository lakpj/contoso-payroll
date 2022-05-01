FROM node:12.4.0-alpine as build
WORKDIR /frontend
COPY package.json package-lock.json ./
COPY /nginx/nginx.conf ./
RUN npm install --silent
COPY . ./

# Arguments
ARG REACT_APP_API_BASE_URL
ENV REACT_APP_API_BASE_URL=${REACT_APP_API_BASE_URL}

RUN npm run build

FROM nginx:stable-alpine
COPY --from=build /frontend /var/www

# Copy our custom nginx config
COPY --from=build /frontend ./
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]