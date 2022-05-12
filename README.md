## Docs

### API Design

#### Posts

| HTTP Method | URL Path                                        | Status Code | Description                  | Status |
| ----------- | ----------------------------------------------- | ----------- | ---------------------------- | ------ |
| GET         | /api/posts                                      | 200         | Get all posts                | ✔      |
| GET         | /api/posts/{id}                                 | 200         | Get post by ID               | ✔      |
| POST        | /api/posts                                      | 201         | Create a new post            | ✔      |
| PUT         | /api/posts/{id}                                 | 200         | Update an exisitng post      | ✔      |
| DELETE      | /api/posts/{id}                                 | 200         | Delete post by ID            | ✔      |
| GET         | /api/posts?pageSize=5&pageNo=1&sortBy=firstName | 200         | Paginating and sorting posts |        |

#### Comments

| HTTP Method | URL Path                          | Status Code | Description                                                | Status |
| ----------- | --------------------------------- | ----------- | ---------------------------------------------------------- | ------ |
| GET         | /api/posts/{postId}/comments      | 200         | Get all comments which belongs to post with id=postId      |        |
| GET         | /api/posts/{postId}/comments/{id} | 200         | Get comments by id if it belongs to post with id=postId    |        |
| POST        | /api/posts/{postId}/comments      | 201         | Create new comment for post with id=postId                 |        |
| PUT         | /api/posts/{postId}/comments/{id} | 200         | Update comment by id  if it belongs to post with id=postId |        |
| DELETE      | /api/posts/{postId}/comments/{id} | 200         | Delete comment by id if it belongs to post with id=postId  |        |

#### Authentication

| HTTP Method | URL Path         | Status Code | Description | Status |
| ----------- | ---------------- | ----------- | ----------- | ------ |
| POST        | /api/auth/signup | 200         | Sign up     |        |
| POST        | /api/auth/login  | 200         | Log in      |        |

