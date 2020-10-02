# Experience API
Save your Experience and use them in future


# Database (MongoDB)

Collection (name = 'experiences')

1. id (Auto generated)
2. userId (int)
3. subject (string)
4. description (string)
5. tags (array of strings)
6. link

# API Specification

1. Description : Add a experience to Database <br />
   URI : /api/v1/addExp <br />

2. Description : Update a experience <br />
   URI : /api/v1/updateExp/{id} <br />
   
3. Description : Get a Experience <br />
   URI : /api/v1/getExp/{id} <br />
   
 4. Description : Delete a Experience <br />
   URI : /api/v1/deleteExp/{id} <br />
 
 5. Description : Common API for retrieving all experiences <br />
    URI : /api/v1/ <br />


Full API Specifications : https://docs.google.com/document/d/14q7EbG5-XmlIEFWf502l9z0o7lkc7J50nEqGO_pynf0/edit
