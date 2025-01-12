// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone
    {
        public readonly string? CustomerEmail;
        public readonly string? PeerReviewedBy;
        public readonly string? TicketId;
        public readonly bool? UnitTested;

        [OutputConstructor]
        private PropertyIncludeActivationComplianceRecordNoncomplianceReasonNone(
            string? customerEmail,

            string? peerReviewedBy,

            string? ticketId,

            bool? unitTested)
        {
            CustomerEmail = customerEmail;
            PeerReviewedBy = peerReviewedBy;
            TicketId = ticketId;
            UnitTested = unitTested;
        }
    }
}
