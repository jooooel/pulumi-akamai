// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs extends com.pulumi.resources.ResourceArgs {

    public static final PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs Empty = new PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs();

    @Import(name="customerEmail")
    private @Nullable Output<String> customerEmail;

    public Optional<Output<String>> customerEmail() {
        return Optional.ofNullable(this.customerEmail);
    }

    @Import(name="peerReviewedBy")
    private @Nullable Output<String> peerReviewedBy;

    public Optional<Output<String>> peerReviewedBy() {
        return Optional.ofNullable(this.peerReviewedBy);
    }

    @Import(name="ticketId")
    private @Nullable Output<String> ticketId;

    public Optional<Output<String>> ticketId() {
        return Optional.ofNullable(this.ticketId);
    }

    @Import(name="unitTested")
    private @Nullable Output<Boolean> unitTested;

    public Optional<Output<Boolean>> unitTested() {
        return Optional.ofNullable(this.unitTested);
    }

    private PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs() {}

    private PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs(PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs $) {
        this.customerEmail = $.customerEmail;
        this.peerReviewedBy = $.peerReviewedBy;
        this.ticketId = $.ticketId;
        this.unitTested = $.unitTested;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs $;

        public Builder() {
            $ = new PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs();
        }

        public Builder(PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs defaults) {
            $ = new PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs(Objects.requireNonNull(defaults));
        }

        public Builder customerEmail(@Nullable Output<String> customerEmail) {
            $.customerEmail = customerEmail;
            return this;
        }

        public Builder customerEmail(String customerEmail) {
            return customerEmail(Output.of(customerEmail));
        }

        public Builder peerReviewedBy(@Nullable Output<String> peerReviewedBy) {
            $.peerReviewedBy = peerReviewedBy;
            return this;
        }

        public Builder peerReviewedBy(String peerReviewedBy) {
            return peerReviewedBy(Output.of(peerReviewedBy));
        }

        public Builder ticketId(@Nullable Output<String> ticketId) {
            $.ticketId = ticketId;
            return this;
        }

        public Builder ticketId(String ticketId) {
            return ticketId(Output.of(ticketId));
        }

        public Builder unitTested(@Nullable Output<Boolean> unitTested) {
            $.unitTested = unitTested;
            return this;
        }

        public Builder unitTested(Boolean unitTested) {
            return unitTested(Output.of(unitTested));
        }

        public PropertyActivationComplianceRecordNoncomplianceReasonNoneArgs build() {
            return $;
        }
    }

}
