# Experience API
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

1. Description : Add a experience to Database <br />
   URI : /api/v1/addExp <br />

2. Description : Update a experience <br />
   URI : /api/v1/updateExp/{id} <br />
   
3. Description : Get a Experience <br />
   URI : /api/v1/getExp/{id} <br />
   
 4. Description : Delete a Experience <br />
   URI : /api/v1/deleteExp/{id} <br />
