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
    public sealed class GetImagingPolicyImagePolicyResult
    {
        public readonly Outputs.GetImagingPolicyImagePolicyBreakpointsResult? Breakpoints;
        public readonly ImmutableArray<string> Hosts;
        public readonly Outputs.GetImagingPolicyImagePolicyOutputResult? Output;
        public readonly ImmutableArray<Outputs.GetImagingPolicyImagePolicyPostBreakpointTransformationResult> PostBreakpointTransformations;
        public readonly string? RolloutDuration;
        public readonly ImmutableArray<Outputs.GetImagingPolicyImagePolicyTransformationResult> Transformations;
        public readonly ImmutableArray<Outputs.GetImagingPolicyImagePolicyVariableResult> Variables;

        [OutputConstructor]
        private GetImagingPolicyImagePolicyResult(
            Outputs.GetImagingPolicyImagePolicyBreakpointsResult? breakpoints,

            ImmutableArray<string> hosts,

            Outputs.GetImagingPolicyImagePolicyOutputResult? output,

            ImmutableArray<Outputs.GetImagingPolicyImagePolicyPostBreakpointTransformationResult> postBreakpointTransformations,

            string? rolloutDuration,

            ImmutableArray<Outputs.GetImagingPolicyImagePolicyTransformationResult> transformations,

            ImmutableArray<Outputs.GetImagingPolicyImagePolicyVariableResult> variables)
        {
            Breakpoints = breakpoints;
            Hosts = hosts;
            Output = output;
            PostBreakpointTransformations = postBreakpointTransformations;
            RolloutDuration = rolloutDuration;
            Transformations = transformations;
            Variables = variables;
        }
    }
}