// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class DatastreamConfigFrequencyArgs extends com.pulumi.resources.ResourceArgs {

    public static final DatastreamConfigFrequencyArgs Empty = new DatastreamConfigFrequencyArgs();

    /**
     * The time in seconds after which the system bundles log lines into a file and sends it to a destination. `30` or `60` are the possible values.
     * 
     */
    @Import(name="timeInSec", required=true)
    private Output<Integer> timeInSec;

    /**
     * @return The time in seconds after which the system bundles log lines into a file and sends it to a destination. `30` or `60` are the possible values.
     * 
     */
    public Output<Integer> timeInSec() {
        return this.timeInSec;
    }

    private DatastreamConfigFrequencyArgs() {}

    private DatastreamConfigFrequencyArgs(DatastreamConfigFrequencyArgs $) {
        this.timeInSec = $.timeInSec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatastreamConfigFrequencyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatastreamConfigFrequencyArgs $;

        public Builder() {
            $ = new DatastreamConfigFrequencyArgs();
        }

        public Builder(DatastreamConfigFrequencyArgs defaults) {
            $ = new DatastreamConfigFrequencyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param timeInSec The time in seconds after which the system bundles log lines into a file and sends it to a destination. `30` or `60` are the possible values.
         * 
         * @return builder
         * 
         */
        public Builder timeInSec(Output<Integer> timeInSec) {
            $.timeInSec = timeInSec;
            return this;
        }

        /**
         * @param timeInSec The time in seconds after which the system bundles log lines into a file and sends it to a destination. `30` or `60` are the possible values.
         * 
         * @return builder
         * 
         */
        public Builder timeInSec(Integer timeInSec) {
            return timeInSec(Output.of(timeInSec));
        }

        public DatastreamConfigFrequencyArgs build() {
            $.timeInSec = Objects.requireNonNull($.timeInSec, "expected parameter 'timeInSec' to be non-null");
            return $;
        }
    }

}