// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetIamStatesResult {
    private String country;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<String> states;

    private GetIamStatesResult() {}
    public String country() {
        return this.country;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<String> states() {
        return this.states;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetIamStatesResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String country;
        private String id;
        private List<String> states;
        public Builder() {}
        public Builder(GetIamStatesResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.country = defaults.country;
    	      this.id = defaults.id;
    	      this.states = defaults.states;
        }

        @CustomType.Setter
        public Builder country(String country) {
            this.country = Objects.requireNonNull(country);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder states(List<String> states) {
            this.states = Objects.requireNonNull(states);
            return this;
        }
        public Builder states(String... states) {
            return states(List.of(states));
        }
        public GetIamStatesResult build() {
            final var o = new GetIamStatesResult();
            o.country = country;
            o.id = id;
            o.states = states;
            return o;
        }
    }
}