// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.akamai.outputs.GetPropertyIncludeParentsParent;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetPropertyIncludeParentsResult {
    private String contractId;
    private String groupId;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String includeId;
    private List<GetPropertyIncludeParentsParent> parents;

    private GetPropertyIncludeParentsResult() {}
    public String contractId() {
        return this.contractId;
    }
    public String groupId() {
        return this.groupId;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String includeId() {
        return this.includeId;
    }
    public List<GetPropertyIncludeParentsParent> parents() {
        return this.parents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyIncludeParentsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String contractId;
        private String groupId;
        private String id;
        private String includeId;
        private List<GetPropertyIncludeParentsParent> parents;
        public Builder() {}
        public Builder(GetPropertyIncludeParentsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contractId = defaults.contractId;
    	      this.groupId = defaults.groupId;
    	      this.id = defaults.id;
    	      this.includeId = defaults.includeId;
    	      this.parents = defaults.parents;
        }

        @CustomType.Setter
        public Builder contractId(String contractId) {
            this.contractId = Objects.requireNonNull(contractId);
            return this;
        }
        @CustomType.Setter
        public Builder groupId(String groupId) {
            this.groupId = Objects.requireNonNull(groupId);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder includeId(String includeId) {
            this.includeId = Objects.requireNonNull(includeId);
            return this;
        }
        @CustomType.Setter
        public Builder parents(List<GetPropertyIncludeParentsParent> parents) {
            this.parents = Objects.requireNonNull(parents);
            return this;
        }
        public Builder parents(GetPropertyIncludeParentsParent... parents) {
            return parents(List.of(parents));
        }
        public GetPropertyIncludeParentsResult build() {
            final var o = new GetPropertyIncludeParentsResult();
            o.contractId = contractId;
            o.groupId = groupId;
            o.id = id;
            o.includeId = includeId;
            o.parents = parents;
            return o;
        }
    }
}