# Experience
Save your Experience and use them in future


# Database (MongoDB)

Collection (name = 'experiences')

1. id (Auto generated)
2. userId (int)
3. subject (string)
4. description (string)
5. tags (array of strings)
6. links (array of strings)

# API Specification

1. Description : Add a experience to Database
   URI : /api/v1/addExp
   Method : POST
   Request body : {
      "userId" : 5,
      "subject" : "Java function calls in parallel",
      "description" : "Create callable object for every function and then executor",
      "tags" : ["java", "threading", "parallelization", "optimisation"],
      "links" : ["https://stackoverflow.com/questions/18162863/how-to-run-different-methods-parallely"]
   },
   Response body : {
      "id" : aUniqueId,
      "userId" : 5,
      "subject" : "Java function calls in parallel",
      "description" : "Create callable object for every function and then executor",
      "tags" : ["java", "threading", "parallelization"],
      "links" : ["https://stackoverflow.com/questions/18162863/how-to-run-different-methods-parallely"]
   }

2. Description : Update a experience 
   URI : /api/v1/updateExp/{id}
   Method : PUT
   Request body : {
      "userId" : 5,
      "subject" : "Java function calls in parallel",
      "description" : "Create callable object for every function and then executor",
      "tags" : ["java", "threading", "parallelization", "optimisation"],
      "links" : ["https://stackoverflow.com/questions/18162863/how-to-run-different-methods-parallely"]
   },
   Response body : {
      "id" : aUniqueId,
      "userId" : 5,
      "subject" : "Java function calls in parallel",
      "description" : "Create callable object for every function and then executor",
      "tags" : ["java", "threading", "parallelization", "optimisation"],
      "links" : ["https://stackoverflow.com/questions/18162863/how-to-run-different-methods-parallely"]
   }
   
3. Description : Get a Experience
   URI : /api/v1/getExp/{id}
   Method : GET,
   Response body : {
      "id" : aUniqueId,
      "userId" : 5,
      "subject" : "Java function calls in parallel",
      "description" : "Create callable object for every function and then executor",
      "tags" : ["java", "threading", "parallelization", "optimisation"],
      "links" : ["https://stackoverflow.com/questions/18162863/how-to-run-different-methods-parallely"]
   }
   
 4. Description : Delete a Experience
   URI : /api/v1/deleteExp/{id}
   Method : DELETE,
   Response body : {
      "id" : aUniqueId
   }
