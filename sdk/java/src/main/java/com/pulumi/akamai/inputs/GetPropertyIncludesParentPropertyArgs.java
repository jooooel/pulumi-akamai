// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetPropertyIncludesParentPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetPropertyIncludesParentPropertyArgs Empty = new GetPropertyIncludesParentPropertyArgs();

    /**
     * (Required) The property&#39;s unique identifier.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return (Required) The property&#39;s unique identifier.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    /**
     * (Required) The version of the activated parent property.
     * 
     */
    @Import(name="version", required=true)
    private Output<Integer> version;

    /**
     * @return (Required) The version of the activated parent property.
     * 
     */
    public Output<Integer> version() {
        return this.version;
    }

    private GetPropertyIncludesParentPropertyArgs() {}

    private GetPropertyIncludesParentPropertyArgs(GetPropertyIncludesParentPropertyArgs $) {
        this.id = $.id;
        this.version = $.version;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetPropertyIncludesParentPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetPropertyIncludesParentPropertyArgs $;

        public Builder() {
            $ = new GetPropertyIncludesParentPropertyArgs();
        }

        public Builder(GetPropertyIncludesParentPropertyArgs defaults) {
            $ = new GetPropertyIncludesParentPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param id (Required) The property&#39;s unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id (Required) The property&#39;s unique identifier.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        /**
         * @param version (Required) The version of the activated parent property.
         * 
         * @return builder
         * 
         */
        public Builder version(Output<Integer> version) {
            $.version = version;
            return this;
        }

        /**
         * @param version (Required) The version of the activated parent property.
         * 
         * @return builder
         * 
         */
        public Builder version(Integer version) {
            return version(Output.of(version));
        }

        public GetPropertyIncludesParentPropertyArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            $.version = Objects.requireNonNull($.version, "expected parameter 'version' to be non-null");
            return $;
        }
    }

}