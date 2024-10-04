# Keycloak Custom Entity Deployment

This project allows you to build and deploy a custom Keycloak provider that integrates custom tables (e.g., **UserCounts**) into Keycloak. You can deploy it easily using **Docker** and **Docker Compose**.

## Prerequisites

Before running this project, ensure the following are installed on your local machine:

### 1. Docker
Install Docker by following the official guide:  
[Docker Installation Guide](https://docs.docker.com/get-docker/)

### 2. Docker Compose
Install Docker Compose by following these instructions:  
[Docker Compose Installation](https://docs.docker.com/compose/install/)

## Build and Deployment

To build the project and run the custom Keycloak instance:

1. Clone the repository or navigate to the project directory.
2. Run the following command to execute the deployment script:

    ```bash
    ./deploy.sh
    ```

   The script will:
    - Remove any existing Docker image with the name `keycloak-customentity-keycloak`
    - Spin up the Keycloak instance using **Docker Compose**

## Stopping the Services

To stop the running Keycloak instance, you can run:

```bash
sudo docker compose down
