package com.example.demo;

import com.example.demo.model.ModelApiResponse;
import com.example.demo.model.Pet;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.constraints.*;
import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;

/**
 * A delegate to be called by the {@link PetApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2025-02-25T19:40:24.675320-05:00[America/Toronto]", comments = "Generator version: 7.8.0")
public interface PetApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /pet : Add a new pet to the store
     * Add a new pet to the store
     *
     * @param pet Create a new pet in the store (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 405)
     * @see PetApi#addPet
     */
    default ResponseEntity<Pet> addPet(Pet pet) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<pet> <id>10</id> <name>doggie</name> <category> <id>1</id> <name>Dogs</name> </category> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <tag> <id>123456789</id> <name>aeiou</name> </tag> </tags> <status>aeiou</status> </pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /pet/{petId} : Deletes a pet
     * 
     *
     * @param petId Pet id to delete (required)
     * @param apiKey  (optional)
     * @return Invalid pet value (status code 400)
     * @see PetApi#deletePet
     */
    default ResponseEntity<Void> deletePet(Long petId,
        String apiKey) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /pet/findByStatus : Finds Pets by status
     * Multiple status values can be provided with comma separated strings
     *
     * @param status Status values that need to be considered for filter (optional, default to available)
     * @return successful operation (status code 200)
     *         or Invalid status value (status code 400)
     * @see PetApi#findPetsByStatus
     */
    default ResponseEntity<List<Pet>> findPetsByStatus(String status) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" }, { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<pet> <id>10</id> <name>doggie</name> <category> <id>1</id> <name>Dogs</name> </category> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <tag> <id>123456789</id> <name>aeiou</name> </tag> </tags> <status>aeiou</status> </pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /pet/findByTags : Finds Pets by tags
     * Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.
     *
     * @param tags Tags to filter by (optional)
     * @return successful operation (status code 200)
     *         or Invalid tag value (status code 400)
     * @see PetApi#findPetsByTags
     */
    default ResponseEntity<List<Pet>> findPetsByTags(List<String> tags) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" }, { \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<pet> <id>10</id> <name>doggie</name> <category> <id>1</id> <name>Dogs</name> </category> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <tag> <id>123456789</id> <name>aeiou</name> </tag> </tags> <status>aeiou</status> </pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /pet/{petId} : Find pet by ID
     * Returns a single pet
     *
     * @param petId ID of pet to return (required)
     * @return successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     * @see PetApi#getPetById
     */
    default ResponseEntity<Pet> getPetById(Long petId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<pet> <id>10</id> <name>doggie</name> <category> <id>1</id> <name>Dogs</name> </category> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> <tag> <id>123456789</id> <name>aeiou</name> </tag> </tags> <status>aeiou</status> </pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * PUT /pet : Update an existing pet
     * Update an existing pet by Id
     *
     * @param pet Update an existent pet in the store (required)
     * @return Successful operation (status code 200)
     *         or Invalid ID supplied (status code 400)
     *         or Pet not found (status code 404)
     *         or Validation exception (status code 405)
     * @see PetApi#updatePet
     */
    default ResponseEntity<Pet> updatePet(Pet pet) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"photoUrls\" : [ \"photoUrls\", \"photoUrls\" ], \"name\" : \"doggie\", \"id\" : 10, \"category\" : { \"name\" : \"Dogs\", \"id\" : 1 }, \"tags\" : [ { \"name\" : \"name\", \"id\" : 0 }, { \"name\" : \"name\", \"id\" : 0 } ], \"status\" : \"available\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/xml"))) {
                    String exampleString = "<pet> <id>10</id> <name>doggie</name> <photoUrls> <photoUrls>aeiou</photoUrls> </photoUrls> <tags> </tags> <status>aeiou</status> </pet>";
                    ApiUtil.setExampleResponse(request, "application/xml", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /pet/{petId} : Updates a pet in the store with form data
     * 
     *
     * @param petId ID of pet that needs to be updated (required)
     * @param name Name of pet that needs to be updated (optional)
     * @param status Status of pet that needs to be updated (optional)
     * @return Invalid input (status code 405)
     * @see PetApi#updatePetWithForm
     */
    default ResponseEntity<Void> updatePetWithForm(Long petId,
        String name,
        String status) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /pet/{petId}/uploadImage : uploads an image
     * 
     *
     * @param petId ID of pet to update (required)
     * @param additionalMetadata Additional Metadata (optional)
     * @param body  (optional)
     * @return successful operation (status code 200)
     * @see PetApi#uploadFile
     */
    default ResponseEntity<ModelApiResponse> uploadFile(Long petId,
        String additionalMetadata,
        org.springframework.core.io.Resource body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"code\" : 0, \"type\" : \"type\", \"message\" : \"message\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
