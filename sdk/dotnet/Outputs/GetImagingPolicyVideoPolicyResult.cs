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
    public sealed class GetImagingPolicyVideoPolicyResult
    {
        public readonly Outputs.GetImagingPolicyVideoPolicyBreakpointsResult? Breakpoints;
        public readonly ImmutableArray<string> Hosts;
        public readonly Outputs.GetImagingPolicyVideoPolicyOutputResult? Output;
        public readonly string? RolloutDuration;
        public readonly ImmutableArray<Outputs.GetImagingPolicyVideoPolicyVariableResult> Variables;

        [OutputConstructor]
        private GetImagingPolicyVideoPolicyResult(
            Outputs.GetImagingPolicyVideoPolicyBreakpointsResult? breakpoints,

            ImmutableArray<string> hosts,

            Outputs.GetImagingPolicyVideoPolicyOutputResult? output,

            string? rolloutDuration,

            ImmutableArray<Outputs.GetImagingPolicyVideoPolicyVariableResult> variables)
        {
            Breakpoints = breakpoints;
            Hosts = hosts;
            Output = output;
            RolloutDuration = rolloutDuration;
            Variables = variables;
        }
    }
}